package model.util;

public class Utilitary {

	public static String createChangeInventoryEquipmentDevolucion(String workPoint, String registration) {
		if (workPoint != null && registration != null) {
			return "Equipamento devolvido pelo usu�rio: " + registration;
		} else if (workPoint != null && registration == null) {
			return "Equipamento recolhido para estoque";
		}
		return null;
	}

	public static String createChangeInventoryMonitorDevolucion(String workPoint, String registration) {
		if (workPoint != null && registration != null) {
			return "Monitor devolvido pelo usu�rio: " + registration;
		} else if (workPoint != null && registration == null) {
			return "Monitor recolhido para estoque";
		}
		return null;
	}
	
	public static String createChangeInventoryEquipmentDelivery(String workPoint, String registration) {
		if (workPoint != null && registration != null) {
			return "Equipamento entregue ao usu�rio: " + registration;
		} else if (workPoint != null && registration == null) {
			return "Equipamento alocado na posi��o: " + workPoint;
		}
		return null;
	}
	
	public static String createChangeInventoryMonitorDelivery(String workPoint, String registration) {
		if (workPoint != null && registration != null) {
			return "Monitor entregue ao usu�rio: " + registration;
		} else if (workPoint != null && registration == null) {
			return "Monitor alocado na posi��o: " + workPoint;
		}
		return null;
	}
	
	public static String createChangeInventoryWorkPositionDelivery(String workPoint, String serialNumberEquipment) {
		if (workPoint != null && serialNumberEquipment != null) {
			return "Posi��o ocupada pelo equipamento: " + serialNumberEquipment;
		} 
		return null;
	}
	
	public static String createChangeInventoryWorkPositionDevolucion(String workPoint) {
		if (workPoint != null) {
			return "Posi��o de trabalho desocupada";
		} 
		return null;
	}
	
	public static boolean ToCheckHostName(String hostNameToCheck_) {
		String a = hostNameToCheck_.substring(0, 6);

		if (a.equalsIgnoreCase("SPODSK") || a.equalsIgnoreCase("SPONTB")) {
			return true;
		}
		return false;
	}
}
