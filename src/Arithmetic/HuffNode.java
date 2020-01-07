/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arithmetic;

/**
 *
 * @author KHUONGNGUYEN
 */
import java.io.Serializable;
public class HuffNode implements Serializable {
    public char Char;
    public String Code;
    public Integer Freq;
    public HuffNode RightNode;
    public HuffNode LeftNode;
    public Integer getFreq() {
        return Freq;
    }
    public HuffNode(Integer freq) {
        Freq = freq;
    }
    public HuffNode(char aChar, Integer freq) {
        Char = aChar;
        Freq = freq;
    }
}
