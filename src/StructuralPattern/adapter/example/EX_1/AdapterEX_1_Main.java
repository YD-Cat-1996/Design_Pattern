package StructuralPattern.adapter.example.EX_1;

import StructuralPattern.adapter.example.EX_1.adapter.ElectricAdapter;
import StructuralPattern.adapter.example.EX_1.adapter.OpticalAdapter;
import StructuralPattern.adapter.example.EX_1.impl.ElectricMotor;
import StructuralPattern.adapter.example.EX_1.impl.OpticalMotor;
import StructuralPattern.adapter.example.EX_1.interf.AnotherInterface;
import StructuralPattern.adapter.example.EX_1.interf.Motor;

public class AdapterEX_1_Main {

    public static void main(String[] args) {
        AnotherInterface eMotor=new ElectricMotor();
        Motor eMotorAdapter=new ElectricAdapter(eMotor);
        eMotorAdapter.drive();

        AnotherInterface oMoter=new OpticalMotor();
        Motor oMotorAdapter=new OpticalAdapter(oMoter);
        oMotorAdapter.drive();
    }
}
