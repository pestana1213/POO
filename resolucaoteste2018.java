// teste 2018
//1)
public class TicketSuporte {
    private String nomeO ; // quem originou o pedido
    private LocalDateTime horaOcorrencia ; // instante do report do ticket
    private String assunto ;
    private String descri¸c~ao ;
    private String identTecnico ; // t´ecnico que resolveu o ticket
    private LocalDateTime horaFecho ; // instante do fecho do ticket
...
// m´etodo que efectua a resolu¸c~ao de um ticket .
//O algoritmo de resolu¸c~ao est´a codificado neste m´etodo .
public void executaTarefa () {...}
...
}

public class Tecnico {
    private String ident ; // identificador do t´ecnico
    private String nome ; // nome do t´ecnico
    private int numTickets ; // n´umero de tickets resolvidos
...
}
public class Supervisor extends Tecnico {
    private List < String > equipa ;
}
public class SistemaTickets {
    private Map < String , Tecnico > funcionarios ; // funcionarios da empresa
    private List < Ticket > ticketsPorResolver ; // tickets ainda n~ao tratados
    private List < Ticket > ticketsResolvidos ; // tickets j´a satisfeitos
...
}

public void adicionaTicket(Ticket t){
    this.ticketsPorResolver.add(t);
}

public void resolveTicket(String ident) throws TecnicoNaoExisteException{
    Ticket ticket = new Ticket(); 
    if(this.ticketsPorResolver.size()>0){
        ticket = ticketsPorResolver.get(0);
    }

    if(this.funcionarios.keySet().contains(ident)){
        Tecnico t = this.funcionarios.get(ident);
        ticket.executaTarefa();
        this.ticketsPorResolver.remove(ticket);
        this.ticketsResolvidos.add(ticket);
    }
    else {
        throw new TecnicoNaoExisteException("");
    }
}

public Map<String,List<Ticket> ticketsPorTecnico(){
    Map<String,List<Ticket> ret = new LinkedHashMap<>();

    for(Tecnico t : this.funcionarios){
        List<Ticket> ticks = new List<>();
        for(Ticket ticket : this.ticketsResolvidos){
            if (ticket.getIdent().equals(t.getIndent())){
                ticks.add(ticket);
            }
        }
        ret.put(t.getIndent(),ticks);
    }
    return ret;
}

public String supervisorTop(){
    Comparator <Tecnico> comp = (e1,e2) -> (int) e2.getNumTicks()-e1.getNumTicks();
    return this.funcionarios.stream().filter(e->e.instanceof(Supervisor)).sorted(comp).get(0);
}



//2) 

public class Eletrodomestico {
    private String ident ;
    private LocalDateTime inicio ;
    private LocalDateTime parcial ;
    private double consumoLigada ;
    private double consumoTotal ;
    private double consumoParcial ;
    private boolean estado ; // false - desligada , true - ligada
    public Eletrodomestico ( String ident , double consumo ) {...}
    // liga o eletrodom´estico
    public void EletrodomesticoON () {...}
    // desliga o electrodom´estico
    public void EletrodomesticoOFF () {...}
    // devolve o consumo desde o in´ıcio
    public double totalConsumo () {...}
    // devolve o consumo desde o ´ultimo reset
    public double periodoConsumo () {...}
    public void efectuarResetConsumo () {...}
}


public class SmartHome{
    private Map<String,Eletrodomestico> els; 

    public SmartHome(){
        this.els = new LinkedHashMap<>();
    }

    public SmartHome(Map<String,Eletrodomestico> eletro){
        this.els = eletro.entryset().stream().collect(Collectors.toMap(Map.Entry::getvalue, e->e.getKey().clone()));
    }

    public SmartHome(SmartHome e){
        this.els = e.getEls();
    }

    public Map<String,Eletrodomestico> getEls(){
        return this.els.entryset().stream().collect(Collectors.toMap(Map.Entry::getvalue,e->e.getKey().clone()));
    }

    public void setEls(Map<String,Eletrodomestico> ele){
        this.els = ele.entryset().stream().collect(Collectors.toMap(Map.Entry::getvalue,e->e.getKey().clone()));
    }

    public boolean equals(SmartHome e){
        return this.els.equals(e.getEls());
    }

    public String toString(){
        StringBuffer sb = new StringBuffer(); 
        for(Eletrodomestico e : this.els.values()){
            sb.append("Eletrodomestico: " + e.getIndent());
        }
        return sb.toString();
    }

    public SmartHome clone(){
        return new SmartHome(this);
    }

    public void addEletrodomestico(Eletrodomestico e){
        this.els.putIfAbsent(e.getIndent(),e.clone());
    }

    public void desligaEletrodomestico(String id)throws EletrodomesticoExcecao{
        if(!this.els.keySet().contais(id)){
            throw new EletrodomesticoExcecao("");
        }
        this.els.get(id).EletrodomesticoOFF();
    }
}

public Class EletrodomesticoExcecao extends Exception{
    public EletrodomesticoExcecao(String msg){
        super(msg);
    }
}

public Class EletrodomesticoInteligente extends Eletrodomestico{
    private LocalDateTime ligar; 
    private LocalDateTime desligar; 

}


public Class EletrodomesticoEcologico extends Eletrodomestico{
    private LocalDateTime ligar; 
    private LocalDateTime desligar; 
}



public abstract class Poligono {
    private List < Ponto > pontos ;
    ...
    public Poligono () {...}
    public Poligono ( Lista < Ponto > pts ) { ... }
    public List < Ponto > getPontos () { ... }
    public void addPonto ( Ponto p ) { ... }
    public abstract double area ();
}

public class PoligonoConvexo extends Poligono{

    public boolean eConvexo()

    public PoligonoConvexo(List<Ponto> pts) throws NaoConvexoException{
        super(pts);
    }
//NAO ENTENDI
    public List<Triangulo> triangula(){

    }
}

public class Triangulo{
    private Ponto x; 
    private Ponto y; 
    private Ponto z;

    public Triangulo (Ponto x, Ponto y, Ponto z){
        if (x.equals(z)){
            this.x = x; 
            this.y = y; 
            this.z = z;
        }
    }

    public Double area(){
        double a = x.distancia(y);
        double b = y.distancia(z);
        double c = z.distancia(x);

        double s = (a+b+c)/2;
        return sqrt ( s *( s - a )*( s - b )*( s - c ))
    }
}
