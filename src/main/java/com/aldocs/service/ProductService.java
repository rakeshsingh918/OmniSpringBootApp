package com.aldocs.service;

import com.aldocs.model.AIMJob;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

  public List<AIMJob> findAllJob() {
    AIMJob aimJob = new AIMJob();
    aimJob.setActive(true);
    AIMJob aimJob1 = new AIMJob();
    aimJob1.setActive(true);
    AIMJob aimJob2 = new AIMJob();
    aimJob2.setActive(true);
    List<AIMJob> aimJobList = new ArrayList<>();
    aimJobList.add(aimJob);
    aimJobList.add(aimJob1);
    aimJobList.add(aimJob2);
    return aimJobList;
  }

  public AIMJob findById(int id) {
    return new AIMJob();
  }

  public AIMJob findById(Long id) {
    return new AIMJob();
  }

  public void saveJob(AIMJob product) {
    System.out.println("new job saved");
  }

  public void updateJob(AIMJob currentProduct) {
    System.out.println("updated job saved");
  }

  public void deleteJobById(long id) {
    System.out.println("updated job deleted");
  }

  public void deleteAllJob() {
    System.out.println("updated job deleted");
  }
}
