package pl.sda.makropl;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RyzeTest {

    @Test
    public void dajMnieRyz() {
        Ryze ryze=new Ryze(2,5);
        boolean act= ryze.dajMnieRyz(7);
        System.out.println("Lacznie zostalo: "+ryze.mamyTyżu);
        System.out.println("po 5: "+ryze.paczka5);
        System.out.println("po 1: "+ryze.paczka1);
        Assert.assertEquals(true,act);

    }

}