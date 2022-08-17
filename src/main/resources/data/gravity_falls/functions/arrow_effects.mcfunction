data modify entity @e[type=minecraft:arrow,limit=1,nbt={damage:0.5}] Potion set value "minecraft:water_breathing"
execute as @e[nbt={ActiveEffects:[{Id:13,Amplifier:0b}]}] run effect give @s minecraft:slowness 10 100 true
execute as @e[nbt={ActiveEffects:[{Id:13,Amplifier:0b}]}] run effect give @s minecraft:blindness 10 100 true
execute as @e[nbt={ActiveEffects:[{Id:13,Amplifier:0b}]}] run effect clear @s minecraft:water_breathing