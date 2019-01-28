package com.steammachine.demo.simpleprocessor.processor;

import static java.lang.String.format;

import com.steammachine.demo.simpleprocessor.annotations.TechnicalDebt;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic.Kind;


/**
 * {@link com.steammachine.demo.simpleprocessor.processor.TechnicalDebtProcessor}
 */
@SupportedAnnotationTypes({"com.steammachine.demo.simpleprocessor.annotations.TechnicalDebt"})
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class TechnicalDebtProcessor extends AbstractProcessor {

    private Filer filer;
    private Messager messager;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);
        filer = processingEnv.getFiler();
        messager = processingEnv.getMessager();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
        debug("\n\n");
        debug(" ======================================================== ");
        debug("#process(...) in " + this.getClass().getSimpleName());
        debug(" ======================================================== ");

        for (TypeElement ann : annotations) {
            debug(" ==> TypeElement ann = %s", ann);
            //
            List<? extends Element> es = ann.getEnclosedElements();
            debug(" ====> ann.getEnclosedElements() count = " + es.size());
            for (Element e : es) {
                debug(" ========> EnclosedElement: %s", e);
            }

            ElementKind kind = ann.getKind();
            debug(" ====> ann.getKind() = " + kind);
            Set<? extends Element> e2s = env.getElementsAnnotatedWith(ann);

            debug(" ====> env.getElementsAnnotatedWith(ann) count = %d", e2s.size());
            for (Element e2 : e2s) {
                debug(" ========> ElementsAnnotatedWith: " + e2);
                debug("           - Kind : " + e2.getKind());


                // The name of the class is annotated by @Controller
                String elementName = e2.getSimpleName().toString();

                TechnicalDebt technicalDebt = e2.getAnnotation(TechnicalDebt.class);
                technicalDebt.value();
                debug("--->>> value found", technicalDebt.value());
            }
        }
        return true;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    private void debug(String message, Object... args) {
        messager.printMessage(Kind.NOTE, format(message, args));
    }


}
