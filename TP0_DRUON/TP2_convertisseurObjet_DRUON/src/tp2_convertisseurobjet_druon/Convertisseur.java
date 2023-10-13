/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_druon;

/**
 *
 * @author vdruo
 */
public class Convertisseur {
    
    int nbConversions;
    
    //creons un constructeur pour les attributs de cette classe
    public Convertisseur() {
        nbConversions = 0;
    }
    
    //creons les differentes methode de convertions 
    public float CelciusVersKelvin (float tCelcius) {
        float tKelvin = (float) (tCelcius + 273.15);
        nbConversions += 1;
        return tKelvin;
    }
    
    public float KelvinVersCelcius (float tKelvin) {
        float tCelcius = (float) (tKelvin - 273.15);  
        nbConversions += 1;
        return tCelcius;
    }
    
    public float FarenheitVersCelcius (float tFarenheit) {
        float tCelcius = (float) ((tFarenheit - 32)*(5/9.0));   
        nbConversions += 1;
        return tCelcius;
    }
    
    public float CelciusVersFarenheit (float tCelcius) {
        float tFarenheit = (float) (tCelcius*(9/5.0) + 32);  
        nbConversions += 1;
        return tFarenheit;
    }
    
    public float KelvinVersFarenheit (float tKelvin) {
    float tCelcius = KelvinVersCelcius(tKelvin);
    float tFarenheit = CelciusVersFarenheit(tCelcius);
    nbConversions -= 1;
    return tFarenheit;
    }
    
    public float FarenheitVersKelvin (float tFarenheit) {
        float tCelcius = FarenheitVersCelcius(tFarenheit);
        float tKelvin = CelciusVersKelvin(tCelcius);
        nbConversions -= 1;
        return tKelvin;
    }
    
    @Override
    public String toString () {
    return "nb de conversions "+ nbConversions;
    }
    
    
}
