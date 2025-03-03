package controller;


import dto.FreteRequestDTO;
import dto.FreteResponseDTO;
import com.service.FreteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/frete")
public class FreteController {

    @Autowired
    private FreteService service;


    @PostMapping
    public ResponseEntity<FreteResponseDTO> save(@RequestBody FreteRequestDTO dto) {
        return ResponseEntity.ok().body(service.save(dto));
    }
    @GetMapping(value = "/cepOrigem/{cepOrigem}/cepDestino/{cepDestino}/nomeDestinatario/{nomeDestinatario}")
    public ResponseEntity<List<FreteResponseDTO>> findFrete(@PathVariable String cepOrigem,
                                                            @PathVariable String cepDestino, @PathVariable String nomeDestinatario) {
        return ResponseEntity.ok().body(service.findFrete(cepOrigem, cepDestino, nomeDestinatario));
    }
}
