/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_07;

/**
 *
 * @author kietm
 */
public class SinhVienIT extends SinhVien {

    private double scoreJava;
    private double scoreHTML;

    public SinhVienIT() {
    }

    public SinhVienIT(double scoreJava, double scoreHTML) {
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
    }

    public double getScoreJava() {
        return scoreJava;
    }

    public double getScoreHTML() {
        return scoreHTML;
    }

    public void setScoreJava(double scoreJava) {
        this.scoreJava = scoreJava;
    }

    public void setScoreHTML(double scoreHTML) {
        this.scoreHTML = scoreHTML;
    }

    @Override
    double getScore() {
        return (this.scoreJava * 2 + this.scoreHTML) / 3;
    }
}
