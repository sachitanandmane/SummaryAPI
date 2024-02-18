package org.example.Service;

import org.example.Entity.Summary;
import org.example.Repo.SummaryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SummaryService {

    @Autowired
    SummaryRepo summaryRepo;
    public List<Summary> getAllSummary() {
        return summaryRepo.findAll();
    }

    public Summary insertSummary(Summary summary){
        return summaryRepo.save(summary);
    }

}
