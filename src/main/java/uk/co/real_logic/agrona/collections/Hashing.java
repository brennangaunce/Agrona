/*
 * Copyright 2015 Real Logic Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.real_logic.agrona.collections;

public class Hashing
{

    public static int intHash(final int value, final int mask)
    {
        final int hash = (value << 1) - (value << 8);
        return hash & mask;
    }

    public static int longHash(final long value, final int mask)
    {
        int hash = (int)value ^ (int)(value >>> 32);
        hash = (hash << 1) - (hash << 8);
        return hash & mask;
    }

}
