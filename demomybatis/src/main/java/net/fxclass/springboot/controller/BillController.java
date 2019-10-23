package net.fxclass.springboot.controller;

import net.fxclass.springboot.entities.Bill;
import net.fxclass.springboot.mapper.BillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class BillController {
    @Resource
    BillMapper billMapper;

    @GetMapping("/bill/{bid}")
    public Bill getBillByBid(@PathVariable("bid") Integer bid){
        Bill bill = billMapper.getBillByBid(bid);
        return bill;
    }

    @GetMapping("/bill")
    public Bill addBill(Bill bill){
        billMapper.addBill(bill);
        return bill;
    }
}
