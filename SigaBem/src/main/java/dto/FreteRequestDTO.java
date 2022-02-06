package dto;

import entity.Frete;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FreteRequestDTO {

    private String cepOrigem;
    private String cepDestino;
    private Double peso;
    private String nomeDestinatario;

    public FreteRequestDTO(Frete entity) {
        cepOrigem = entity.getCepOrigem();
        cepDestino = entity.getCepDestino();
        peso = entity.getPeso();
        nomeDestinatario = entity.getNomeDestinatario();

    }
}
