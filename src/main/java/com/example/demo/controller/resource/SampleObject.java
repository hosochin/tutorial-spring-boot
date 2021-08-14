package com.example.demo.controller.resource;

import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@AllArgsConstructor
public class SampleObject {
    @NotNull
    private String id;
    @NotNull
    private String name;
    @NotEmpty
    @Valid
    private List<SubSampleObject> list;

    @Valid
    private SubSampleObject subSampleObject;

    @AllArgsConstructor
    public static class SubSampleObject {
        @NotNull
        private String rank;
    }
}
