package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JDefinedClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jsonschema2pojo.AbstractAnnotator;

public class LombokAnnotator extends AbstractAnnotator {

    @Override
    public void propertyInclusion(JDefinedClass clazz, JsonNode schema) {
        clazz.annotate(Data.class);
        clazz.annotate(Builder.class);
        clazz.annotate(AllArgsConstructor.class);
        clazz.annotate(NoArgsConstructor.class);
    }
}