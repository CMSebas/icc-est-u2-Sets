import controller.Sets;

public class App {
    public static void main(String[] args) {
        Sets sets=new Sets();

        runHashSet(sets);
        runLinkedHashSet(sets);
        runTreeHashSet(sets);
        runTreeHashSet(sets);
        runTreeHashSetwithCode(sets);
        
        
    }

    public static void runHashSet(Sets sets){
        System.out.println("-----------HashSet--------");
        System.out.println("ELEMNTOS DEL HASHSET NO SE GARANTIZA EL ORDEN");
        sets.construirHashSet();
    }

    public static void runLinkedHashSet(Sets sets){
        System.out.println("----------------LinkedHashSet-----------");
        System.out.println("ELEMENTOS DEL LINKEDHASHSET SE GARANTIZA EL ORDEN DE INSERCION");
        sets.construirLinkedHashSet();
    }

    public static void runTreeHashSet(Sets sets){
        System.out.println("----------------Tresset -----------");
        System.out.println("ELEMENTOS DEL Tresset ");
        sets.construirTreeSet();
    }

    public static void runTreeHashSetwithCode(Sets sets){
        System.out.println("----------------Tresset con comparator-----------");
        System.out.println("ELEMENTOS DEL treeset ");
        sets.construirTreeSetConComparador();
    }

    public static void runTreeHashSetwithCodeTwo(Sets sets){
        System.out.println("----------------Tresset con comparator-----------");
        System.out.println("ELEMENTOS DEL treeset (ordenados por longitud y luego alfabeticamente)");
        sets.construirTreeSetConComparador();
    }

    
}
