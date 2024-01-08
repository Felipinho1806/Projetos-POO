import java.util.ArrayList;
import model.Curso;
import model.Disciplina;
import model.Aluno;
import model.Apontamento;
import model.Grade;
import model.Politecnico;
import model.Professor;

public class MyProgram {
    public static void main(String[] args) {
        
        ArrayList<Curso> PolitecnicoDoPorto = new ArrayList<Curso>();

        Curso LicenciaturaEmEngenhariaInformatica = new Curso("Licenciatura em engenharia informática", "2067/2022");
        Curso LicenciaturaEmCienciasEmpresariais = new Curso("Licenciatura em ciências empresariais", "8601/2019");
        Curso LicenciaturaEmCienciasEmpresariaisPosLaboral = new Curso("Licenciatura em ciências empresariais (Pós-Laboral)", "8601/2019");
        Curso LicenciaturaEmGestaoIndustrialLogistica = new Curso("Licenciatura em gestão industrial logística", "6732/2018");
        Curso LicenciaturaEmSegurancaDoTrabalhoEAmbiente = new Curso("Licenciatura em segurança do trabalho e ambiente", "3205/2022");
        Curso LicenciaturaEmSegurancaInformaticaEmRedesDeComputadores = new Curso("Licenciatura em segurança informática em redes de computadores", "6064/2021");
        Curso LicenciaturaEmSistemasDeInformacaoParaGestao = new Curso("Sistenas de informação para gestão", "9929/2020");
        Curso LicenciaturaEmSolicitadoria = new Curso("Solicitadoria", "7798/2022");
        Curso LicenciaturaEmSolicitadoriaPosLaboral = new Curso("Solicitadoria (Pós-Laboral)", "7798/2022");
        
        PolitecnicoDoPorto.add(LicenciaturaEmEngenhariaInformatica);
        PolitecnicoDoPorto.add(LicenciaturaEmCienciasEmpresariais);
        PolitecnicoDoPorto.add(LicenciaturaEmCienciasEmpresariaisPosLaboral);
        PolitecnicoDoPorto.add(LicenciaturaEmGestaoIndustrialLogistica);
        PolitecnicoDoPorto.add(LicenciaturaEmSegurancaDoTrabalhoEAmbiente);
        PolitecnicoDoPorto.add(LicenciaturaEmSegurancaInformaticaEmRedesDeComputadores);
        PolitecnicoDoPorto.add(LicenciaturaEmSistemasDeInformacaoParaGestao);
        PolitecnicoDoPorto.add(LicenciaturaEmSolicitadoria);
        PolitecnicoDoPorto.add(LicenciaturaEmSolicitadoriaPosLaboral);

        //Primeiro período:

        Disciplina ÁlgebraLinearEGeometriaAnalítica = new Disciplina("Álgebra Linear e Geometria Analítica", 1, 18 * 6);
        Disciplina FísicaAplicada = new Disciplina("Física Aplicada", 1, 18 * 5);
        Disciplina FundamentosDeProgramação = new Disciplina("Fundamentos de Programação", 1, 18 * 7);
        Disciplina IntroduçãoAosSistemasComputacionais = new Disciplina("Introdução aos Sistemas Computacionais", 1, 18 * 5);
        Disciplina LaboratórioDeProgramação = new Disciplina("Laboratório de Programação", 1, 18 * 7);

        //Segundo período:

        Disciplina EngenhariaDeSoftwareI = new Disciplina("Engenharia de Software I", 2, 18 * 7);
        Disciplina MatemáticaComputacionalI = new Disciplina("Matemática Computacional I", 2, 18 * 6);
        Disciplina MatemáticaDiscreta = new Disciplina("Matemática Discreta", 2, 18 * 6);
        Disciplina ParadigmasDeProgramação = new Disciplina("Paradigmas de Programação", 2, 18 * 7);
        Disciplina SistemasDigitaisEArquiteturadeComputadores = new Disciplina("Sistemas Digitais e Arquitetura de Computadores", 2, 18 * 4);

        //Terceiro período:

        Disciplina EngenhariaDeSoftwareII = new Disciplina("Engenharia de Software II", 3, 18 * 7);
        Disciplina EstruturasDeDados = new Disciplina("Estruturas de Dados", 3, 18 * 7);
        Disciplina MatemáticaComputacionalII = new Disciplina("Matemática Computacional II", 3, 18 * 6);
        Disciplina ProcessamentoEstruturadoDeInformação = new Disciplina("Processamento Estruturado de Informação", 3, 18 * 5);
        Disciplina SistemasOperativos = new Disciplina("Sistemas Operativos", 3, 18 * 5);

        //Quarto período:

        Disciplina AnáliseAlgorítmicaEOtimização = new Disciplina("Análise Algorítmica e Otimização", 4, 18 * 6);
        Disciplina BasesDeDados = new Disciplina("Bases de Dados", 4, 18 * 6);
        Disciplina GestãoDeProjetosInformáticos = new Disciplina("Gestão de Projetos Informáticos", 4, 18 * 6);
        Disciplina ProgramaçãoEmAmbienteWeb = new Disciplina("Programação em Ambiente Web", 4, 18 * 7);
        Disciplina RedesDeComputadores = new Disciplina("Redes de Computadores", 4, 18 * 7);

        //Quinto período:

        Disciplina AdministraçãoDeSistemasInformáticos = new Disciplina("Administração de Sistemas Informáticos", 5, 18 * 5);
        Disciplina ComputaçãoMóvelEUbíqua = new Disciplina("Computação Móvel e Ubíqua", 5, 18 * 6);
        Disciplina LaboratórioDeDesenvolvimentoDeSoftware = new Disciplina("Laboratório de Desenvolvimento de Software", 5, 18 * 7);
        Disciplina SistemasDeInformação = new Disciplina("Sistemas de Informação", 5, 18 * 6);
        Disciplina SistemasDistribuídos = new Disciplina("Sistemas Distribuídos", 5, 18 * 6);

        //Sexto período:

        Disciplina InteligênciaArtificial = new Disciplina("Inteligência Artificial", 6, 18 * 5);
        Disciplina ProjetoFinal = new Disciplina("Projeto Final", 6, 18 * 18);
        Disciplina SistemasDeInformaçãoOrganizacionais = new Disciplina("Sistemas de Informação Organizacionais", 6, 18 * 4);
        Disciplina NoçõesdeGestão_opcional = new Disciplina("Noções de Gestão (opcional)", 6, 18 * 3);

        ArrayList<Disciplina> grade = new ArrayList<Disciplina>();

        grade.add(ÁlgebraLinearEGeometriaAnalítica);
        grade.add(FísicaAplicada);
        grade.add(FundamentosDeProgramação);
        grade.add(IntroduçãoAosSistemasComputacionais);
        grade.add(LaboratórioDeProgramação);

        grade.add(EngenhariaDeSoftwareI);
        grade.add(MatemáticaComputacionalI);
        grade.add(MatemáticaDiscreta);
        grade.add(ParadigmasDeProgramação);
        grade.add(SistemasDigitaisEArquiteturadeComputadores);

        EngenhariaDeSoftwareII.setPreRequisitos(new ArrayList<Disciplina>());
        EngenhariaDeSoftwareII.getPreRequisitos().add(EngenhariaDeSoftwareI);
        grade.add(EngenhariaDeSoftwareII);
        grade.add(EstruturasDeDados);
        MatemáticaComputacionalII.setPreRequisitos(new ArrayList<Disciplina>());
        MatemáticaComputacionalII.getPreRequisitos().add(MatemáticaComputacionalI);
        grade.add(MatemáticaComputacionalII);
        grade.add(ProcessamentoEstruturadoDeInformação);
        grade.add(SistemasOperativos);

        grade.add(AnáliseAlgorítmicaEOtimização);
        BasesDeDados.setPreRequisitos(new ArrayList<Disciplina>());
        BasesDeDados.getPreRequisitos().add(EstruturasDeDados); //BasesDeDados
        grade.add(BasesDeDados);
        grade.add(GestãoDeProjetosInformáticos);
        ProgramaçãoEmAmbienteWeb.setPreRequisitos(new ArrayList<Disciplina>());
        ProgramaçãoEmAmbienteWeb.getPreRequisitos().add(FundamentosDeProgramação);
        grade.add(ProgramaçãoEmAmbienteWeb);
        grade.add(RedesDeComputadores);

        grade.add(AdministraçãoDeSistemasInformáticos);
        grade.add(ComputaçãoMóvelEUbíqua);
        grade.add(LaboratórioDeDesenvolvimentoDeSoftware);
        grade.add(SistemasDeInformação);
        grade.add(SistemasDistribuídos);

        grade.add(InteligênciaArtificial);
        grade.add(ProjetoFinal);
        grade.add(SistemasDeInformaçãoOrganizacionais);
        grade.add(NoçõesdeGestão_opcional);

        Grade gradeLicenciaturaEI = new Grade(2022, 777, grade, LicenciaturaEmEngenhariaInformatica);
        Politecnico polidPorto = new Politecnico("Politecnico do porto", "https://www.estg.ipp.pt/", PolitecnicoDoPorto);
        Professor prof = new Professor(1, 222.2, 2,"Cristiano", "Fuschillo", "2468");

        ArrayList<Apontamento> apontamentos = new ArrayList<Apontamento>();
        Aluno aln = new Aluno("Felipe", "Corrêa", "1356", 7777, apontamentos, gradeLicenciaturaEI);

        Apontamento apontamento1 = new Apontamento(10.0, "Aprovado", "2023-12-10", ÁlgebraLinearEGeometriaAnalítica);
        apontamentos.add(apontamento1);
        Apontamento apontamento2 = new Apontamento(9.2, "Aprovado", "2023-12-10", FísicaAplicada);
        apontamentos.add(apontamento2);
        Apontamento apontamento3 = new Apontamento(8.3, "Aprovado", "2023-12-10", FundamentosDeProgramação);
        apontamentos.add(apontamento3);
        Apontamento apontamento4 = new Apontamento(8.5, "Aprovado", "2023-12-10", IntroduçãoAosSistemasComputacionais);
        apontamentos.add(apontamento4);
        Apontamento apontamento5 = new Apontamento(7.5, "Aprovado", "2023-12-10", LaboratórioDeProgramação);
        apontamentos.add(apontamento5);
        Apontamento apontamento6 = new Apontamento(7.7, "Aprovado", "2023-12-10", EngenhariaDeSoftwareI);
        apontamentos.add(apontamento6);
        Apontamento apontamento7 = new Apontamento(7.0, "Aprovado", "2023-12-10", MatemáticaComputacionalI);
        apontamentos.add(apontamento7);
        Apontamento apontamento8 = new Apontamento(7.2, "Aprovado", "2023-12-10", MatemáticaDiscreta);
        apontamentos.add(apontamento8);
        Apontamento apontamento9 = new Apontamento(8.8, "Aprovado", "2023-12-10", ParadigmasDeProgramação);
        apontamentos.add(apontamento9);
        Apontamento apontamento10 = new Apontamento(8.7, "Aprovado", "2023-12-10", SistemasDigitaisEArquiteturadeComputadores);
        apontamentos.add(apontamento10);

        aln.imprimirPessoa();
        prof.imprimirPessoa();

        aln.imprimirHistorico();
        System.out.println(aln.estaIntegralizado());

        for(Disciplina disc: aln.getDisciplinasFaltantes()) {
            disc.imprimirRequisitos();
        }
    }   
}
