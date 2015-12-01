package controllers;

import play.*;
import play.mvc.*;
import models.Task;
import play.libs.Json;

import views.html.*;

public class Application extends Controller {

    public Result index() {
    	Task task = new Task();
    	task.id = 11l;
    	task.name = "my task";
    	task.save();
        return ok(Json.toJson(task));
    }

}
