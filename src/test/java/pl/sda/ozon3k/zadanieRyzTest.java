package pl.sda.ozon3k;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class zadanieRyzTest {

    @Test
    public void transakcja() {
        zadanieRyz ryze = new zadanieRyz(2,5);
        int rob=  ryze.transakcja(7);
        System.out.println("jest tyle ryżu:"+ ryze.ilosci);
        System.out.println("5kg"+ ryze.ryzMPaczka);
        System.out.println("1kg"+ryze.ryzNPaczka);
        Assert.assertEquals(7, rob);
    }
}