package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LoadRoadmap {
    public static void main(String []args) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        List<Roadmap> roadmapList = mapper.readValue(LoadRoadmap.class.getClassLoader().getResourceAsStream("abc.json"), new TypeReference<List<Roadmap>>() {
        });

        //autogenere incremental id's
        AtomicInteger counter = new AtomicInteger(1);
        roadmapList.forEach(r-> r.setId(counter.getAndIncrement()));
        roadmapList.forEach(System.out::println);
    }
}
