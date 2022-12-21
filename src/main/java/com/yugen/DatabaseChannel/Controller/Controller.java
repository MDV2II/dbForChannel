package com.yugen.DatabaseChannel.Controller;

import com.yugen.DatabaseChannel.Database.Entity.UpdatesEntity;
import com.yugen.DatabaseChannel.Database.Service.UpdatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private UpdatesService updatesService;

    @GetMapping("/list")
    public List<UpdatesEntity> getList() {
        return updatesService.getAll();
    }

    @GetMapping("/last")
    public UpdatesEntity getLast() {
        return updatesService.getLast();
    }

    @PostMapping("/save")
    public UpdatesEntity save(@RequestBody UpdatesEntity updates) {
        return updatesService.save(updates);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody UpdatesEntity updates) {
        updatesService.delete(updates);
    }

    @PostMapping("/delete/{id}")
    public void deleteById(@PathVariable long id) {
        updatesService.deleteById(id);
    }

    @PostMapping("/deleteAll")
    public void deleteAll() {
        updatesService.deleteAll();
    }


}
