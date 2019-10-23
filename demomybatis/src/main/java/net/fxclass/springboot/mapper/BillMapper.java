package net.fxclass.springboot.mapper;

import net.fxclass.springboot.entities.Bill;

public interface BillMapper {
    Bill getBillByBid(Integer bid);

    int addBill(Bill bill);
}
