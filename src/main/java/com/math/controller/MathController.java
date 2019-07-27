package com.math.controller;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Project: MathAngular
 * Package: com.controller
 * <p>
 * User: jeremytouch
 * Date: 7/25/19
 * Time: 12:10 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */


@Controller
public class MathController {

    @GetMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/mathQuestions")
    @ResponseBody
    public String mathQuestions() throws JSONException {
        int max = 5;
        int min = 1;
        JSONArray jsonArray = new JSONArray();
        JSONObject finalObject = new JSONObject();
//        JSONObject jsonMain = new JSONObject();


        ArrayList arrayList = new ArrayList();

        for (int i = 0; i < 50; i++) {
            int x;
            int y;
            int[] questionArray;
            int[] answersArray = new int[4];
            int randomAssign;
            Random r = new Random();
            x = r.nextInt((max - min) + 1) + min;
            y = r.nextInt((max - min) + 1) + min;
            int answer = x + y;

            randomAssign = r.nextInt((3 - 0) + 1);
            if (randomAssign == 0) {
                answersArray[0] = answer;
                answersArray[1] = answer + 1;
                answersArray[2] = answer + 2;
                answersArray[3] = answer + 3;
            } else if (randomAssign == 1) {
                answersArray[0] = answer - 1;
                answersArray[1] = answer;
                answersArray[2] = answer + 1;
                answersArray[3] = answer + 2;
            } else if (randomAssign == 2) {
                answersArray[0] = answer - 2;
                answersArray[1] = answer - 1;
                answersArray[2] = answer;
                answersArray[3] = answer + 1;
            } else if (randomAssign == 3) {
                answersArray[0] = answer - 3;
                answersArray[1] = answer - 2;
                answersArray[2] = answer - 1;
                answersArray[3] = answer;
            }

            questionArray = new int[]{x, y, answer};

            arrayList.add(0, answersArray);
            arrayList.add(0, questionArray);

            HashMap<int[], int[]> hashMap = new HashMap<>();
            hashMap.put(questionArray, answersArray);
            JSONObject jsonObject = new JSONObject();
            JSONObject jsonMain = new JSONObject();
            jsonObject.put("x", x);
            jsonObject.put("y", y);
            jsonObject.put("Answer", answer);
            jsonObject.put("potentialAnswer1", answersArray[0]);
            jsonObject.put("potentialAnswer2", answersArray[1]);
            jsonObject.put("potentialAnswer3", answersArray[2]);
            jsonObject.put("potentialAnswer4", answersArray[3]);

            jsonMain.put("Question "+i, jsonObject);


            finalObject.put("MathQuestions", jsonArray.put(jsonMain));
        }
//        return finalObject.toString();
        return finalObject.toString();

    }

}

