package net.proselyte.springsecurityapp.service;

import net.proselyte.springsecurityapp.model.Ship;

import java.util.List;

public interface ShipService {

    public void addShip(Ship Ship);

    public List<Ship> getAllShips();

    public void deleteShip(Integer ShipId);

    public Ship getShip(int Shipid);

    public Ship updateShip(Ship Ship);
}
