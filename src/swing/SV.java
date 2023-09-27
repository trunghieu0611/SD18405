/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

/**
 *
 * @author Dell
 */
public class SV {
    private String name;
    private float marks;

    public SV() {
    }

    public SV(String name, float marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

   

    @Override
    public String toString() {
        return "SV{" + "name=" + name + ", marks=" + marks + '}';
    }
   
    
    
}
