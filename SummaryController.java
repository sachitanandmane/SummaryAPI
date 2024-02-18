package org.example.Controller;

import org.example.Entity.Summary;
import org.example.Service.SummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class SummaryController {
    @Autowired
    SummaryService summaryService;
    @GetMapping("/getSummary")
    public List<Summary> getAllSummary(){
        return summaryService.getAllSummary();
    }

    @PostMapping("/insertSummary")
    public Summary insertSummary(@RequestBody Summary summary){
        return summaryService.insertSummary(summary);
    }
}
