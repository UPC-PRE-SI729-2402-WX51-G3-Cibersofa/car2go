package com.pe.platform.interaction.interfaces.rest.dto;  // Ajusta este paquete según la ubicación que elijas.

public class CreateReviewRequest {
    private int vehicleId;
    private String notes;
    private String status;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
