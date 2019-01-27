package com.steammachine.demo.simpleprocessor.processor;

import com.steammachine.demo.simpleprocessor.annotations.DemoProcessed;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

@SupportedAnnotationTypes({"ds.magic.annotations.compileTime.Implement"})
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class DemoProcessedProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {

        Set<? extends Element> annotatedElements = env
                .getElementsAnnotatedWith(DemoProcessed.class);

        for (Element annotated : annotatedElements) {
            DemoProcessed annotation = annotated.getAnnotation(DemoProcessed.class);
        }

        Messager messager = processingEnv.getMessager();
        for (TypeElement te : annotations) {
            for (Element e : env.getElementsAnnotatedWith(te)) {
                messager.printMessage(Diagnostic.Kind.NOTE, "Printing: " + e);
            }
        }

        return false;
    }

}
