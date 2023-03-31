package br.com.contmatic.prova.empresa;

import static br.com.contmatic.prova.constantes.FuncionarioConstante.ATIVO_FUNCIONARIO_MENSAGEM_NULO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.CARGO_MENSAGEM_CARACTERE_ESPECIAL;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.CARGO_MENSAGEM_ESPACO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.CARGO_MENSAGEM_NULO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.CARGO_MENSAGEM_NUMEROS;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.CARGO_MENSAGEM_TAMANHO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.CARGO_MENSAGEM_VAZIO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.CARGO_TAMANHO_MAXIMO_25;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.CARGO_TAMANHO_MINIMO_5;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.CPF_MENSAGEM_CARACTERE_ESPECIAL;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.CPF_MENSAGEM_ESPACO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.CPF_MENSAGEM_INVALIDO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.CPF_MENSAGEM_LETRAS;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.CPF_MENSAGEM_NULO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.CPF_MENSAGEM_TAMANHO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.CPF_MENSAGEM_VAZIO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.CPF_TAMANHO_FIXO_11;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.DATA_NASCIMENTO_MENSAGEM;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.DATA_NASCIMENTO_MENSAGEM_NULO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.MATRICULA_MENSAGEM_CARACTERE_ESPECIAL;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.MATRICULA_MENSAGEM_ESPACO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.MATRICULA_MENSAGEM_LETRAS;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.MATRICULA_MENSAGEM_NULO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.MATRICULA_MENSAGEM_TAMANHO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.MATRICULA_MENSAGEM_VAZIO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.MATRICULA_TAMANHO_FIXO_5;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.NOME_MENSAGEM_CARACTERE_ESPECIAL;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.NOME_MENSAGEM_ESPACO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.NOME_MENSAGEM_NULO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.NOME_MENSAGEM_NUMEROS;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.NOME_MENSAGEM_TAMANHO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.NOME_MENSAGEM_VAZIO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.NOME_TAMANHO_MAXIMO_40;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.NOME_TAMANHO_MINIMO_5;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.SALARIO_MAXIMO_15000;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.SALARIO_MAXIMO_MENSAGEM;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.SALARIO_MENSAGEM_NULO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.SALARIO_MINIMO_1212;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.SALARIO_MINIMO_MENSAGEM;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.SETOR_MENSAGEM_CARACTERE_ESPECIAL;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.SETOR_MENSAGEM_ESPACO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.SETOR_MENSAGEM_NULO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.SETOR_MENSAGEM_NUMEROS;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.SETOR_MENSAGEM_TAMANHO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.SETOR_MENSAGEM_VAZIO;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.SETOR_TAMANHO_MAXIMO_20;
import static br.com.contmatic.prova.constantes.FuncionarioConstante.SETOR_TAMANHO_MINIMO_2;
import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.REGEX_VALIDAR_CARACTERES_ESPECIAIS;
import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.REGEX_VALIDAR_LETRAS;
import static br.com.contmatic.prova.util.validacao.ValidacaoUtil.REGEX_VALIDAR_NUMEROS;

import java.math.BigDecimal;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;
import org.joda.time.LocalDate;

import br.com.contmatic.prova.auditoria.Auditoria;
import br.com.contmatic.prova.util.validacao.Age;
import br.com.contmatic.prova.util.validacao.Space;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(of = {"matricula"}, callSuper = false)
@RequiredArgsConstructor
@ToString
public class Funcionario extends Auditoria{

    @NonNull
    @NotNull(message = MATRICULA_MENSAGEM_NULO)
    @NotEmpty(message = MATRICULA_MENSAGEM_VAZIO)
    @Space(message = MATRICULA_MENSAGEM_ESPACO)
    @Size(min = MATRICULA_TAMANHO_FIXO_5, max = MATRICULA_TAMANHO_FIXO_5, message = MATRICULA_MENSAGEM_TAMANHO)
    @Pattern(regexp = REGEX_VALIDAR_LETRAS, message = MATRICULA_MENSAGEM_LETRAS)
    @Pattern(regexp = REGEX_VALIDAR_CARACTERES_ESPECIAIS, message = MATRICULA_MENSAGEM_CARACTERE_ESPECIAL)
	private String matricula;

    @NotNull(message = CPF_MENSAGEM_NULO)
    @NotEmpty(message = CPF_MENSAGEM_VAZIO)
    @Space(message = CPF_MENSAGEM_ESPACO)
    @Size(min = CPF_TAMANHO_FIXO_11, max = CPF_TAMANHO_FIXO_11, message = CPF_MENSAGEM_TAMANHO)
    @Pattern(regexp = REGEX_VALIDAR_LETRAS, message = CPF_MENSAGEM_LETRAS)
    @Pattern(regexp = REGEX_VALIDAR_CARACTERES_ESPECIAIS, message = CPF_MENSAGEM_CARACTERE_ESPECIAL)
    @CPF(message = CPF_MENSAGEM_INVALIDO)
	private String cpf;

    @NotNull(message = NOME_MENSAGEM_NULO)
    @NotEmpty(message = NOME_MENSAGEM_VAZIO)
    @Space(message = NOME_MENSAGEM_ESPACO)
    @Size(min = NOME_TAMANHO_MINIMO_5, max = NOME_TAMANHO_MAXIMO_40, message = NOME_MENSAGEM_TAMANHO)
    @Pattern(regexp = REGEX_VALIDAR_NUMEROS, message = NOME_MENSAGEM_NUMEROS)
    @Pattern(regexp = REGEX_VALIDAR_CARACTERES_ESPECIAIS, message = NOME_MENSAGEM_CARACTERE_ESPECIAL)
	private String nome;

    @NotNull(message = CARGO_MENSAGEM_NULO)
    @NotEmpty(message = CARGO_MENSAGEM_VAZIO)
    @Space(message = CARGO_MENSAGEM_ESPACO)
    @Size(min = CARGO_TAMANHO_MINIMO_5, max = CARGO_TAMANHO_MAXIMO_25, message = CARGO_MENSAGEM_TAMANHO)
    @Pattern(regexp = REGEX_VALIDAR_NUMEROS, message = CARGO_MENSAGEM_NUMEROS)
    @Pattern(regexp = REGEX_VALIDAR_CARACTERES_ESPECIAIS, message = CARGO_MENSAGEM_CARACTERE_ESPECIAL)
	private String cargo;

    @NotNull(message = SETOR_MENSAGEM_NULO)
    @NotEmpty(message = SETOR_MENSAGEM_VAZIO)
    @Space(message = SETOR_MENSAGEM_ESPACO)
    @Size( min = SETOR_TAMANHO_MINIMO_2, max = SETOR_TAMANHO_MAXIMO_20, message = SETOR_MENSAGEM_TAMANHO)
    @Pattern(regexp = REGEX_VALIDAR_NUMEROS, message = SETOR_MENSAGEM_NUMEROS)
    @Pattern(regexp = REGEX_VALIDAR_CARACTERES_ESPECIAIS, message = SETOR_MENSAGEM_CARACTERE_ESPECIAL)
	private String setor;

    @NotNull(message = DATA_NASCIMENTO_MENSAGEM_NULO)
    @Age(message = DATA_NASCIMENTO_MENSAGEM)
	private LocalDate dataNascimento;

	@NotNull(message = SALARIO_MENSAGEM_NULO)
	@DecimalMin(value = SALARIO_MINIMO_1212, message = SALARIO_MINIMO_MENSAGEM)
	@DecimalMax(value = SALARIO_MAXIMO_15000, message = SALARIO_MAXIMO_MENSAGEM)
	private BigDecimal salario;

	@NotNull(message = ATIVO_FUNCIONARIO_MENSAGEM_NULO)
	private Boolean ativo;

}
