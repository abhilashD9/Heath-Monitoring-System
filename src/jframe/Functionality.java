/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Functionality{
    
    static ArrayList<String> alart = new ArrayList<>();
    
    static String getResult(int a, int b, int c, int d, int e, int f){
        int i = 1;
        String result = "";
        if(a == 1 ) result += i++ + ". Dress in warm layers and use blankets or heated blankets to help raise body temperature.\n\n"+i++ + ". Engage in light physical activity to generate body heat.\n\n";
        if(a == 3 ) result += i++ + ". Drink plenty of fluids like water, herbal tea. \n\n" + i++ + ". Wear light, breathable clothing to allow heat dissipation from the body.\n\n";
        
        if(b == 1 ) result += i++ + ". Stay hydrated, Exercise regularly and Avoid excessive alcohol and caffeine.\n\n";
        if(b == 3 ) result += i++ + ". Need Stress management, Regular exercise and Limit caffeine and stimulants.\n\n";
        
        if(c == 1 ) result += i++ + ". Stay hydrated, Increase salt intake and Avoid sudden position changes.\n\n";
        if(c == 3 ) result += i++ + ". Increase potassium-rich foods, Quit smoking and Reduce sodium intake.\n\n";
        
        if(d == 1 ) result += i++ + ". Maintain a healthy lifestyle with regular exercise, a balanced diet, and adequate hydration to support overall respiratory health. \n\n"+ i++ + ". Ensure a comfortable and safe sleeping environment to promote relaxation and optimal breathing patterns.\n\n";
        if(d == 3 ) result += i++ + ". Practice relaxation techniques, such as deep breathing exercises, to help manage anxiety or panic attacks that may contribute to tachypnea. \n\n" + i++ + ". Avoid triggers that may exacerbate respiratory symptoms, such as allergens, pollutants, or strenuous physical activity.\n\n";

        if(e == 1 ) result += i++ + ". Consume a fast-acting carbohydrate source like fruit juice, regular soda, glucose tablets, or candies to raise blood sugar levels quickly.\n\n";
        if(e == 3 ) result += i++ + ". Stick to a healthy, balanced diet that is low in refined sugars and carbohydrates. \n\n" + i++ + ". Drink plenty of water to stay hydrated and aid in flushing out excess glucose.\n\n";
        
        if(f == 1 ) result += i++ + ". Ensure a safe environment, Stimulate the senses and Encourage movement.\n\n";
        if(f == 3 ) result += i++ + ". Mindfulness and relaxation techniques, Engage in creative pursuits and Engage in intellectually stimulating activities.\n\n";
        
        if(result.equals("")) result = "Follow a balanced diet, Regular exercise, Adequate sleep, Engage in hobbies. \n\nStay mentally active and regularly schedule routine check-ups with your healthcare provider to monitor your overall health, identify potential issues early on, and address any concerns.\n";
        
        return result;
    }
    
    static int getBodyTemp(String input){
        double val = Double.valueOf(input);
        if(val < 90 || val > 105) alart.add("Body Temprature");
        if(val <= 95) return 1;
        else if (val > 95 && val <= 100) return 2;
        else return 3;
    }

    static int getHeartRate(String input){
        int val = Integer.valueOf(input);
        if(val < 45 || val > 120) alart.add("Heart Rate");
        if(val < 60) return 1;
        else if (val >= 60 && val <= 100) return 2;
        else return 3;
    }

    static int getBloodPressure(String input){
        int val = Integer.valueOf(input);
        if(val < 70 || val > 150) alart.add("Blood Pressure");
        if(val < 90) return 1;
        else if (val >= 90 && val <= 130) return 2;
        else return 3;
    }

    static int getRespiratoryRate(String input){
        if(input == "10-20 breath/min") return 1;
        if(input == "20-30 breath/min") return 2;
        return 3;
    }

    static int getGlucoseLevel(String input){
        if(input == "<100mg/dL") return 1;
        if(input == "<100& >125 mg/dL") return 2;
        return 3;
    }

    static int getLoC(String input){
        if(input == "Unconsious") return 1;
        if(input == "Drowsy") return 2;
        return 3;
    }

}
