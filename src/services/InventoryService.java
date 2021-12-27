package services;

import model.entities.InventoryTest;

public class InventoryService {

	public static InventoryTest createChangeInventoryDelivery(InventoryTest inventory_) {
		//Equipment
		if (inventory_.isWorkPositionBoolean()) {
			inventory_.setChangesEquipment("Equipamento alocado na posi��o: " + inventory_.getWorkPosition().getWorkPoint());
		} else if (inventory_.isUserBoolean()) {
			inventory_.setChangesEquipment("Equipamento entregue ao usu�rio: " + inventory_.getUser().getNameUser());
		}
		//Monitor1
		if (inventory_.isWorkPositionBoolean()) {
			inventory_.setChangesMonitor1("Monitor alocado na posi��o: " + inventory_.getWorkPosition().getWorkPoint());
		} else if (inventory_.isUserBoolean()) {
			inventory_.setChangesMonitor1("Monitor entregue ao usu�rio: " + inventory_.getUser().getNameUser());
		}
		//Monitor2
		if (inventory_.isWorkPositionBoolean()) {
			inventory_.setChangesMonitor2("Monitor alocado na posi��o: " + inventory_.getWorkPosition().getWorkPoint());
		} else if (inventory_.isUserBoolean()) {
			inventory_.setChangesMonitor2("Monitor entregue ao usu�rio: " + inventory_.getUser().getNameUser());
		}
		//WorkPosition
		if (inventory_.isWorkPositionBoolean()) {
			inventory_.setChangesWorkPosition("Posi��o ocupada pelo equipamento: " + inventory_.getEquipment().getSerialNumber());
		}
		return inventory_;
	}
}
