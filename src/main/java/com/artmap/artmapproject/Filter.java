package com.artmap.artmapproject;

public interface Filter <I,O>{
    public I transform(I input);
}
