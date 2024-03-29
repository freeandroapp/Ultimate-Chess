/*
    DroidFish - An Android chess program.
    Copyright (C) 2011  Peter Österlund, peterosterlund2@gmail.com

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

package com.chess.android.appdevthree.book;

/** Settings controlling opening book usage */
public final class BookOptions {
    public String filename = "";

    public int maxLength = 1000000;
    public boolean preferMainLines = false;
    public boolean tournamentMode = false;
    public double random = 0; // Scale probabilities according to p^(exp(-random))

    public BookOptions() { }

    public BookOptions(BookOptions other) {
        filename = other.filename;
        maxLength = other.maxLength;
        preferMainLines = other.preferMainLines;
        tournamentMode = other.tournamentMode;
        random = other.random;
    }

    @Override
    public boolean equals(Object o) {
        if ((o == null) || (o.getClass() != this.getClass()))
            return false;
        BookOptions other = (BookOptions)o;

        return ((filename.equals(other.filename)) &&
                (maxLength == other.maxLength) &&
                (preferMainLines == other.preferMainLines) &&
                (tournamentMode == other.tournamentMode) &&
                (random == other.random));
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
