package com.kipruto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("api/v1/software-engineers")
public class SoftwareEngineerController {
    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineers() {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Mobjot",
                        List.of("Java, Node, React")
                ),
                new SoftwareEngineer(
                        2,
                        "Otongo",
                        List.of("C, C#, Assembly")
                )
        );
    }
}
