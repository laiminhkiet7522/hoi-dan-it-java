/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_07;

/**
 *
 * @author kietm
 */
public class SinhVienCoKhi extends SinhVien {

    private double scoreCNC;
    private double scorePLC;

    public SinhVienCoKhi() {
    }

    public SinhVienCoKhi(double scoreCNC, double scorePLC) {
        this.scoreCNC = scoreCNC;
        this.scorePLC = scorePLC;
    }

    public double getScoreCNC() {
        return scoreCNC;
    }

    public double getScorePLC() {
        return scorePLC;
    }

    public void setScoreCNC(double scoreCNC) {
        this.scoreCNC = scoreCNC;
    }

    public void setScorePLC(double scorePLC) {
        this.scorePLC = scorePLC;
    }

    @Override
    double getScore() {
        return (this.scoreCNC + this.scorePLC) / 2;
    }

}
