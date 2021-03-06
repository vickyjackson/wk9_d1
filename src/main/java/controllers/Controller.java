package controllers;

import models.Cohort;
import models.Student;
import models.StudentPair;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class Controller {

    public static void main(String[] args){

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");

        get("/random", (req, res) -> {

            Cohort cohort1 = new Cohort("E23");

            Student randomStudent = cohort1.randomStudent();
            HashMap<String, Object> model = new HashMap<>();
            model.put("randomStudent", randomStudent);
            model.put("template", "random.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/pair", (req, res) -> {

            Cohort cohort1 = new Cohort("E23");

            StudentPair studentPair = cohort1.randomPair();
            HashMap<String, Object> model = new HashMap<>();
            model.put("studentPair", studentPair);
            model.put("template", "pair.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

        get("/pairs", (req, res) -> {

            Cohort cohort1 = new Cohort("E23");

            ArrayList<StudentPair> pairs = cohort1.getAllPairs();
            HashMap<String, Object> model = new HashMap<>();
            model.put("pairs", pairs);
            model.put("template", "pairs.vtl");
            return new ModelAndView(model, "layout.vtl");
        }, velocityTemplateEngine);

    }
}
