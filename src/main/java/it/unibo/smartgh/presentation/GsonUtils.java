package it.unibo.smartgh.presentation;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import it.unibo.smartgh.model.greenhouse.GreenhouseImpl;
import it.unibo.smartgh.model.operation.OperationImpl;
import it.unibo.smartgh.model.parameter.ParameterValueImpl;
import it.unibo.smartgh.model.plant.PlantImpl;
import it.unibo.smartgh.model.plant.PlantParameterImpl;
import it.unibo.smartgh.presentation.deserializer.*;

/**
 * This is a utility class to instantiate the {@link com.google.gson.JsonSerializer} and {@link com.google.gson.JsonDeserializer}
 */
public class GsonUtils {
    /**
     * Create a new Gson builder with specific serializer and deserializer
     * @return a new Gson builder with specific serializer and deserializer
     */
    public static Gson createGson() {
        return new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .serializeNulls()
                .registerTypeAdapter(ParameterValueImpl.class, new ParameterValueDeserializer())
                .registerTypeAdapter(GreenhouseImpl.class, new GreenhouseDeserializer())
                .registerTypeAdapter(PlantImpl.class, new PlantDeserializer())
                .registerTypeAdapter(OperationImpl.class, new OperationDeserializer())
                .registerTypeAdapter(PlantParameterImpl.class, new PlantParameterDeserializer())
                .create();
    }
}
