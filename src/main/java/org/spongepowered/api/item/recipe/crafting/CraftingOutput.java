/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.item.recipe.crafting;

import org.spongepowered.api.item.inventory.ItemStackSnapshot;
import org.spongepowered.api.item.inventory.crafting.CraftingGridInventory;
import org.spongepowered.api.item.recipe.RecipeOutput;

import java.util.List;

/**
 * The result of fulfilling a {@link CraftingRecipe}.
 */
public interface CraftingOutput extends RecipeOutput {

    /**
     * This method should be used instead of the
     * {@link CraftingRecipe#getExemplaryResult()} method, as it customizes the
     * result further depending on the specified ingredient
     * {@link ItemStackSnapshot}. It is advised to use the output of
     * {@link CraftingRecipe#getExemplaryResult()}, modify it accordingly, and
     * {@code return} it.
     *
     * @return The result of fulfilling the requirements of a
     *         {@link CraftingRecipe}
     */
    ItemStackSnapshot getResult();

    /**
     * Returns a list of {@link ItemStackSnapshot} to be set in the input
     * {@link CraftingGridInventory}, contains {@link ItemStackSnapshot#NONE}s for
     * slots which should be cleared.
     *
     * @return A list of {@link ItemStackSnapshot}s to be set in the input
     *         {@link CraftingGridInventory}
     */
    List<ItemStackSnapshot> getRemainingItems();
}