package com.example;

import com.google.auto.service.AutoService;

import javax.annotation.processing.*;

import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import java.util.Set;

import static javax.lang.model.SourceVersion.*;

@SupportedAnnotationTypes({"com.example.annotation"})
@SupportedSourceVersion(value = RELEASE_7)
@AutoService(Processor.class)
public class MyProcesser extends AbstractProcessor {
    private Types tu;
    private Elements eu;
    private Filer f;
    private Messager m;

    protected MyProcesser() {

    }

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        tu = processingEnv.getTypeUtils();
        eu = processingEnv.getElementUtils();
        f = processingEnv.getFiler();
        m = processingEnv.getMessager();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        return false;
    }
}
