package com.example.Aspect_Oriented_Programming.service;

public interface ShipmentService {
    String orderPackage(Long orderId);

    String trackPackage(Long orderId);
}
