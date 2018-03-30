package ua.shalin.springsecurityapp.model;


import javafx.beans.property.SimpleStringProperty;
import ua.shalin.springsecurityapp.model.AbstractModels.Device;

import javax.persistence.Entity;
import java.util.Set;

/**
 * Created by admin on 14.12.2017.
 */

@Entity
public class Mobile extends Device {
    public Mobile() {
    }

    public Mobile(String manufactuer, String model, String type, String code, Set<Issue> issues) {
        super(manufactuer, model, type, code, issues);
    }

    @Override
    public Long getDeviceId() {
        return super.getDeviceId();
    }

    @Override
    public void setDeviceId(Long id) {
        super.setDeviceId(id);
    }

    @Override
    public String getManufactuer() {
        return super.getManufactuer();
    }



    @Override
    public void setManufactuer(String manufactuer) {
        super.setManufactuer(manufactuer);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }



    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public String getType() {
        return super.getType();
    }



    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public String getCode() {
        return super.getCode();
    }


    @Override
    public void setCode(String code) {
        super.setCode(code);
    }

    @Override
    public Set<Issue> getIssues() {
        return super.getIssues();
    }

    @Override
    public void setIssues(Set<Issue> issues) {
        super.setIssues(issues);
    }
}