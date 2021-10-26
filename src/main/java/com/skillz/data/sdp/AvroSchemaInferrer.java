package com.skillz.data.sdp;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.talend.daikon.avro.inferrer.JsonSchemaInferrer;

public class AvroSchemaInferrer {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Enter the input file name");
        } else {
            String payloadContents = Files.readString(Paths.get(args[0]));
            JsonSchemaInferrer schemaInferrer = new JsonSchemaInferrer(new ObjectMapper().enable(DeserializationFeature.USE_LONG_FOR_INTS));
            System.out.println("Inferred schema: \n" + schemaInferrer.inferSchema(payloadContents));
        }
    }
}
