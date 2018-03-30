package ua.shalin.springsecurityapp.service;

import ua.shalin.springsecurityapp.model.AbstractModels.Device;
import ua.shalin.springsecurityapp.model.Ship;

import java.util.List;

public interface DeviceService {

    public void addDevice(Device device);

    public List<Device> getAllDevices();

    public void deleteDevice(Long deviceId);

    public Device getDevice(Long deviceId);

    public List<Device> getDeviceByUser(String name);

}
