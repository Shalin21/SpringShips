package ua.shalin.springsecurityapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.shalin.springsecurityapp.model.AbstractModels.Device;
import ua.shalin.springsecurityapp.model.Ship;

import java.util.List;


public interface DeviceDao {

    public void addDevice(Device device);

    public List<Device> getAllDevices();

    public void deleteDevice(Long deviceId);

    public Device updateDevice(Device device);

    public Device getDevice(Long deviceId);

    public List<Device> getAllDevicesByUsers(String name);

}
