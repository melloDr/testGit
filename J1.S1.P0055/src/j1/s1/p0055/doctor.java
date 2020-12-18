/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s1.p0055;

/**
 *
 * @author Admin
 */
public class doctor {

    String code;
    String name;
    String spec;
    int avai;

    public doctor(String code, String name, String spec, int avai) {
        this.code = code;
        this.name = name;
        this.spec = spec;
        this.avai = avai;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getAvai() {
        return avai;
    }

    public void setAvai(int avai) {
        this.avai = avai;
    }

    public void print() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + spec);
        System.out.println("Availability: " + avai);
    }

    public void print1() {
        System.out.println("Code  Name Spec Avai");
        System.out.println(code + " " + name + " " + spec + " " + avai);
    }
}
