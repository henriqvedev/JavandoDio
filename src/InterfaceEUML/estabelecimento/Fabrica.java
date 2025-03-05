package InterfaceEUML.estabelecimento;


import InterfaceEUML.equipamentos.copiadora.Copiadora;
import InterfaceEUML.equipamentos.digitalizadora.Digitalizadora;
import InterfaceEUML.equipamentos.digitalizadora.Scanner;
import InterfaceEUML.equipamentos.impressora.Deskjet;
import InterfaceEUML.equipamentos.impressora.Impressora;
import InterfaceEUML.equipamentos.impressora.Laserjet;
import InterfaceEUML.equipamentos.multifuncional.Multifuncional;


public class Fabrica {
    public static void main(String[] args){
        Multifuncional equipamentomultifuncional = new Multifuncional();

        Scanner scanner = new Scanner();

        Impressora impressora = equipamentomultifuncional;
        Digitalizadora digitalizadora = equipamentomultifuncional;
        Copiadora copiadora = equipamentomultifuncional;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
