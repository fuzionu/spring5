package com.auth0.samples.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/date")
public class DataController
{
    @GetMapping
    public String showDate(@RequestParam String param)
    {
        if (param.equalsIgnoreCase("time"))
        {
            return "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<title> HTML </title>\n" +
                    "<meta charset=\"UTF-8\">\n" +
                    "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                    "<script type=\"text/javascript\">\n" +
                    "window.addEventListener(\"load\", function()\n" +
                    "{\n" +
                    "let timeLine = document.getElementById(\"time\");\n" +
                    "updateTime();\n" + "setInterval(updateTime, 1000);\n" +
                    "function updateTime()\n" +
                    "{\n" +
                    "timeLine.innerHTML = new Date().toLocaleTimeString();\n" +
                    "}\n" +
                    "});\n" +
                    "</script>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<p>Time is <span id=\"time\"></span></p>\n" +
                    "</body>\n" +
                    "</html>\n";
        }

        else if (param.equalsIgnoreCase("date"))
        {
            return "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<title> HTML </title>\n" +
                    "<meta charset=\"UTF-8\">\n" +
                    "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                    "<script type=\"text/javascript\">\n" +
                    "window.addEventListener(\"load\", function()\n" +
                    "{\n" +
                    "let dateLine = document.getElementById(\"date\");\n" +
                    "updateTime();\n" + "setInterval(updateTime, 1000);\n" +
                    "function updateTime()\n" +
                    "{\n" +
                    "dateLine.innerHTML = new Date().toLocaleDateString();\n" +
                    "}\n" +
                    "});\n" +
                    "</script>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<p>Today is <span id=\"date\"></span></p>\n" +
                    "</body>\n" +
                    "</html>\n";
        }

        throw new MissingParameterException("No parameter found");
    }
}
