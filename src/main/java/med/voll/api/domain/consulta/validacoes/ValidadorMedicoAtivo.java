package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.medico.MedicoRepository;
import med.voll.api.infra.exception.ValidacaoException;

public class ValidadorMedicoAtivo {
    private MedicoRepository repository;
    public void validar(DadosAgendamentoConsulta dados){
        if(dados.idMedico() == null){
            return ;
        }
        var medicoEstaAtivo = repository.findAtivoById(dados.idMedico());
        if (!medicoEstaAtivo){
            throw new ValidacaoException("A consulta nao pode ser agendada com medico inativo!");
        }
    }
}
