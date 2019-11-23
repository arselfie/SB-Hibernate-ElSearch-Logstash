package house.smart.smarthouse.service.impl;


import house.smart.smarthouse.domain.Room;
import house.smart.smarthouse.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TempServImpl {

    @Autowired
    private RoomRepository roomRepository;

//    public void changeTempInARooms() {
//        List<Room> newList = roomRepository.findAll();
//        for (Room room : newList) {
//            room.setTemperature(room.getTemperature() + 1);
//        }
//        roomRepository.saveAll(newList);
//    }

//        public void changeTempInARooms() {
//        List<Room> newList = roomRepository.findAll();
//        for (Room room : newList) {
//            if(room.getTemperature()<50) {
//                room.setTemperature(room.getTemperature() + 1);
//            }else if(room.getTemperature()>=50){
//                room.setTemperature(room.getTemperature() - 1);
//            }
//        }
//        roomRepository.saveAll(newList);
//    }

        public void changeTempInARooms() {
        List<Room> newList = roomRepository.findAll();
            int a = -2; // Начальное значение диапазона - "от"
            int b = 7; // Конечное значение диапазона - "до"

            int random_number1 = a + (int) (Math.random() * b); // Генерация 1-го числа
        for (Room room : newList) {
            room.setTemperature(room.getTemperature() + random_number1);
        }
        roomRepository.saveAll(newList);
    }


}
