package ua.shalin.springsecurityapp.service;

import ua.shalin.springsecurityapp.dao.ShipDao;
import ua.shalin.springsecurityapp.model.Ship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ShipServiceImpl implements ShipService {

    @Autowired
    private ShipDao shipDao;

    @Override
    @Transactional
    public void addShip(Ship Ship) {
        shipDao.addShip(Ship);
    }

    @Override
    @Transactional
    public List<Ship> getAllShips() {
        return shipDao.getAllShips();
    }

    @Override
    @Transactional
    public void deleteShip(Integer ShipId) {
        shipDao.deleteShip(ShipId);
    }

    public Ship getShip(int empid) {
        return shipDao.getShip(empid);
    }

    public Ship updateShip(Ship Ship) {
        // TODO Auto-generated method stub
        return shipDao.updateShip(Ship);
    }

    public void setShipDAO(ShipDao ShipDAO) {
        this.shipDao = ShipDAO;
    }
}
