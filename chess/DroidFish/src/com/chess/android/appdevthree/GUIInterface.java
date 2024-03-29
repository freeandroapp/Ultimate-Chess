/*
    DroidFish - An Android chess program.
    Copyright (C) 2011-2012  Peter Österlund, peterosterlund2@gmail.com

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.chess.android.appdevthree;

import java.util.ArrayList;

import com.chess.android.appdevthree.R;
import com.chess.android.appdevthree.gamelogic.Game;
import com.chess.android.appdevthree.gamelogic.Move;
import com.chess.android.appdevthree.gamelogic.Position;

import android.content.Context;

/** Interface between the GUI and the ChessController. */
public interface GUIInterface {

    /** Update the displayed board position. */
    public void setPosition(Position pos, String variantInfo, ArrayList<Move> variantMoves);

    /** Mark square sq as selected. Set to -1 to clear selection. */
    public void setSelection(int sq);

    final static class GameStatus {
        public Game.GameState state = Game.GameState.ALIVE;
        public int moveNr = 0;
        /** Move required to claim draw, or empty string. */
        public String drawInfo = "";
        public boolean white = false;
        public boolean ponder = false;
        public boolean thinking = false;
        public boolean analyzing = false;
    }

    /** Set the status text. */
    public void setStatus(GameStatus status);

    /** Update the list of moves. */
    public void moveListUpdated();

    /** Update the computer thinking information. */
    public void setThinkingInfo(String pvStr, String statStr, String bookInfo,
                                ArrayList<ArrayList<Move>> pvMoves, ArrayList<Move> bookMoves);

    /** Ask what to promote a pawn to. Should call reportPromotePiece() when done. */
    public void requestPromotePiece();

    /** Run code on the GUI thread. */
    public void runOnUIThread(Runnable runnable);

    /** Report that user attempted to make an invalid move. */
    public void reportInvalidMove(Move m);

    /** Report UCI engine name. */
   // public void reportEngineName(String engine);

    /** Report UCI engine error message. */
    public void reportEngineError(String errMsg);

    /** Called when computer made a move. GUI can notify user, for example by playing a sound. */
    public void computerMoveMade();

    /** Report remaining thinking time to GUI. */
    public void setRemainingTime(long wTime, long bTime, long nextUpdate);

    /** Report a move made that is a candidate for GUI animation. */
    public void setAnimMove(Position sourcePos, Move move, boolean forward);

    /** Return true if positive analysis scores means good for white. */
    public boolean whiteBasedScores();

    /** Return true if pondering (permanent brain) is enabled. */
    public boolean ponderMode();

    /** Return the number of engine threads to use. */
    int engineThreads();

    /** Return application context. */
    public Context getContext();

    /** Get the default player name. */
    public String playerName();
}
