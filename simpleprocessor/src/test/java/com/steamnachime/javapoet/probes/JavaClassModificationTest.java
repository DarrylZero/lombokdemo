package com.steamnachime.javapoet.probes;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import java.io.File;
import java.io.IOException;
import javax.lang.model.element.Modifier;
import javax.lang.model.type.TypeMirror;
import org.junit.Test;

public class JavaClassModificationTest {

    @Test
    public void test() throws IOException {
        TypeSpec generated = TypeSpec.classBuilder("Generated")
                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                .addField(TypeName.OBJECT, "field", Modifier.FINAL , Modifier.PRIVATE)
                .build();
        JavaFile.builder("a.b.c", generated)
                .addFileComment("File comment")
                .build().writeTo(System.out);
    }

}
