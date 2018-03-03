package eu.curiousit.ugo;

import org.springframework.data.repository.CrudRepository;

import eu.curiousit.ugo.Equipment;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface EquipmentRepository extends CrudRepository<Equipment, Long> {

}