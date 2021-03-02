package com.example.minesweeper.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MineGenerator {

    private final int[][] fields;

    @Getter
    private int numberOfMines;

    public void generate() {
        setMineNumber();
        generateMines();
        calculateNumbers();
    }

    private void setMineNumber() {
        if(fields.length >= 5 && fields.length < 10) {
            numberOfMines = 3;
        } else if (fields.length >= 10 && fields.length < 15) {
            numberOfMines = 10;
        } else if (fields.length >= 15 && fields.length < 20) {
            numberOfMines = 15;
        }

        numberOfMines = 0;
    }

    private void generateMines() {

    }

    private void calculateNumbers() {

    }
}
